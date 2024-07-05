package com.vanenburgdemo.exapp.base.dataexport.extractor;

import com.vanenburgdemo.exapp.base.model.EtabAnalyticalBase;
import com.vs.rappit.base.analytical.extractor.logic.BaseAnalyticalExtractorService;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.base.analytical.extract.provider.AnalyticalExtractOptions;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class EtabBaseAnalyticalExtractorService<T extends EtabAnalyticalBase> extends BaseAnalyticalExtractorService<T>{
	private Logger LOGGER = LoggerFactory.getLogger(EtabBaseAnalyticalExtractorService.class);

	public EtabBaseAnalyticalExtractorService(Class<T> modelClass, BaseApplicationConfiguration baseApplicationConfiguration) {
		super(modelClass);
		addPersistenceOption(AnalyticalExtractOptions.USE_LEGACY_SQL, false);
	}
}
