package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.model.IModelTransformer;
import com.vanenburgdemo.exapp.base.model.EtabBase;
import com.vanenburgdemo.exapp.base.model.EtabAnalyticalBase;
import com.vs.rappit.base.util.Configuration;
import java.util.stream.Collectors;

public class EtabAnalyticalTransformer<T extends EtabBase, M extends EtabAnalyticalBase>
		implements IModelTransformer<T, M> {
	private static final String SEPARATOR = "#@$%!*&";
	@Override
	public M writeTo(T model) {
		EtabAnalyticalBase etabAnalyticalBase = new EtabAnalyticalBase();
		
		etabAnalyticalBase.setSid(model.getSid());
		return (M) etabAnalyticalBase;
	}

	@Override
	public Object readFrom(M data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<T> getSourceClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<M> getTargetClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
