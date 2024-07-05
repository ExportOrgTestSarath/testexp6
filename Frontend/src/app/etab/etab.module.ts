import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EtabRoutingModule } from './etab-routing.module';
import { EtabBaseModule } from '@baseapp/etab/etab.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    EtabBaseModule,
    EtabRoutingModule
    
  ],
  exports: [
      EtabBaseModule,
  ]

})
export class EtabModule  { }