package com.vanenburgdemo.exapp.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.EtabAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.EtabBaseExportExtractor;
import com.vanenburgdemo.exapp.dataexport.extractor.EtabAnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class EtabExportExtractor extends EtabBaseExportExtractor<EtabAnalyticalExtractorService, EtabAnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(EtabExportExtractor.class);
	
	public EtabExportExtractor(EtabAnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}
