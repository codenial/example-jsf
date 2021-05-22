CREATE VIEW request_unatended AS
SELECT request.request_id,
		prospect.prospect_name,
		prospect.prospect_lastName,
		prospect.prospect_email,
		request.request_created_at,
	CASE 
		when request_open = 1 Then 'Abierta'
		Else 'Cerrada' END AS status
FROM request_follow_up request
	Join agency_prospects prospect on prospect.prospect_id = request.prospect_id
WHERE  request.request_created_at <= dateadd(day,-3,getdate());