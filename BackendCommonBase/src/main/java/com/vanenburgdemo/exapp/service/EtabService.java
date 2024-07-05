package com.vanenburgdemo.exapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.vanenburgdemo.exapp.base.service.EtabBaseService;
import com.vanenburgdemo.exapp.model.Etab;
import com.vanenburgdemo.exapp.service.EtabPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Etab")
public class EtabService extends EtabBaseService<Etab> implements IEtabService<Etab>{

		@Autowired
		private  EtabPerimeterImpl  etabPerimeterImpl;

		public EtabService(ChangelogService changelogService) {
		super(Etab.class);	
		setChangelogService(changelogService); 
		
	}
	
}