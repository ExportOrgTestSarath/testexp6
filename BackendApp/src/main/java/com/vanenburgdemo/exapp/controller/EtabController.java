package com.vanenburgdemo.exapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.vanenburgdemo.exapp.base.controller.EtabBaseController;
import com.vanenburgdemo.exapp.service.IEtabService;
import com.vanenburgdemo.exapp.service.EtabService;
import com.vanenburgdemo.exapp.model.Etab;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/etabs/", produces = "application/json")
public class EtabController extends EtabBaseController<IEtabService<Etab>, Etab> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EtabController.class.getName());
	public EtabController(EtabService etabService) {
		super(etabService);
	}
}
