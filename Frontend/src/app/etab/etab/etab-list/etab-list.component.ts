import { Component, OnInit,inject } from '@angular/core';
import { EtabListBaseComponent } from '@baseapp/etab/etab/etab-list/etab-list.base.component';
import { EtabService } from '@baseapp/etab/etab/etab.service';


@Component({
  selector: 'app-etab-list',
  templateUrl: '../../../../../base/app/etab/etab/etab-list/etab-list.component.html',
  styleUrls: ['./etab-list.scss']
})
export class EtabListComponent extends EtabListBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}