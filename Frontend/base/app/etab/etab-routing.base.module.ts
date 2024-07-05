import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

import { EtabListComponent } from '@app/etab/etab/etab-list/etab-list.component';
import { EtabDetailComponent } from '@app/etab/etab/etab-detail/etab-detail.component';

export const routes: Routes = [

{
     path: 'etablist',
     component: EtabListComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "ETAB_LIST",
        breadcrumb: "ETAB_LIST",
        roles : [					"all"
				]
     }
},
{
     path: 'etabdetail',
     component: EtabDetailComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "ETAB_DETAIL",
        breadcrumb: "ETAB_DETAIL",
        roles : [					"all"
				]
     }
}
];

@NgModule({
  imports: [ RouterModule.forChild(routes) ],
  exports: [ RouterModule ]
})
export class EtabBaseRoutingModule
{
}
