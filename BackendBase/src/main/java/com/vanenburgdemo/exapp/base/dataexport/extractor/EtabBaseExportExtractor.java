package com.vanenburgdemo.exapp.base.dataexport.extractor;

import org.springframework.beans.factory.annotation.Autowired;

import com.vanenburgdemo.exapp.base.model.EtabAnalyticalBase;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.dataexport.handler.ExportExtractor;
import com.vs.rappit.dataexport.model.RappitExport;

public class EtabBaseExportExtractor<SERVICE extends EtabBaseAnalyticalExtractorService<M>,M extends EtabAnalyticalBase> extends ExportExtractor<RappitExport> {

	private Logger LOGGER = LoggerFactory.getLogger(EtabBaseExportExtractor.class);

	protected SERVICE logic;
	
	public EtabBaseExportExtractor(boolean isChunk, SERVICE logic) {
		super(isChunk);
		this.logic = logic;
	}

	@Override
	public Object extractFile(String outputBucketName, String outputGcsFolderUrl, String query) {
		return logic.createExtract(query, outputBucketName, outputGcsFolderUrl);
	}

}
