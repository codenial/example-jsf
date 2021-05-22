package com.example.jsf.ejb;

import javax.ejb.Singleton;
import com.example.jsf.persistence.entity.Prospect;

@Singleton
public class ProspectFacade extends AbstractFacade<Prospect> implements ProspectFacadeLocal {

	protected ProspectFacade() {
		super(Prospect.class);
	}
	
	@Override
	public Prospect save(Prospect prospect) {
		return super.save(prospect);
	}

}
