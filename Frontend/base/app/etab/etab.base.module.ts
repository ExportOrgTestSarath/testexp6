import { NgModule } from '@angular/core';
import { BsModalService } from 'ngx-bootstrap/modal';
import { SharedModule } from '@app/shared/shared.module';
import { WidgetsBaseModule } from '@libbase/widgets.base.module';
import { ExportsModule } from '@app/exports/exports.module';
import { EtabListComponent } from '@app/etab/etab/etab-list/etab-list.component';
import { EtabDetailComponent } from '@app/etab/etab/etab-detail/etab-detail.component';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

@NgModule({
  declarations: [
    EtabListComponent,
    EtabDetailComponent
  ],
  imports: [
    SharedModule,
    WidgetsBaseModule,
    ExportsModule,
  ],
  exports: [
    SharedModule,
	WidgetsBaseModule,
    EtabListComponent,
    EtabDetailComponent
  ],
  providers: [
  	BsModalService,
	CanDeactivateGuard
  ],
  
})
export class EtabBaseModule { }