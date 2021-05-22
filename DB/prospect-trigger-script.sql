CREATE TRIGGER propspect_request_tg
ON agency_prospects
AFTER  INSERT
AS

BEGIN

	SET NOCOUNT ON;

	DECLARE @prospect_id varchar(20);  
	DECLARE @request_id varchar(20);
	
	SELECT @prospect_id = prospect.prospect_id FROM inserted AS prospect;
	SELECT @request_id = NEXT VALUE FOR prospect_request_seq;
	-- Status 1 when request is open. zero value when closed
    INSERT INTO request_follow_up 
		values (@request_id ,@prospect_id,1,GETDATE(),null);
END