import { EtabBase} from '@baseapp/etab/etab/etab.base.model';

export class EtabApiConstants {
    public static readonly create: any = {
        url: '/rest/etabs/',
        method: 'POST',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/etabs/',
        method: 'PUT',
        showloading: true
    };
    public static readonly getDatatableData: any = {
        url: '/rest/etabs/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/etabs/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/etabs/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/etabs/autosuggest',
        method: 'GET',
        showloading: true
    };
}