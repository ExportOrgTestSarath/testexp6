package com.vanenburgdemo.exapp.dataexport.finalizer;

import org.springframework.stereotype.Service;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.dataexport.finalizer.EtabBaseExportFinalizer;
import com.vanenburgdemo.exapp.service.ApplicationUserService;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class EtabExportFinalizer extends EtabBaseExportFinalizer {

	private Logger LOGGER = LoggerFactory.getLogger(EtabExportFinalizer.class);
	
	public EtabExportFinalizer(ApplicationUserService applicationUserService) {
		super(applicationUserService, true);
	}

}
