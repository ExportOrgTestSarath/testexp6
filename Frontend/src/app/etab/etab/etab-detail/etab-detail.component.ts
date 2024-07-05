import { Component, OnInit,inject } from '@angular/core';
import { EtabDetailBaseComponent } from '@baseapp/etab/etab/etab-detail/etab-detail.base.component';
import { EtabService } from '@baseapp/etab/etab/etab.service';


@Component({
  selector: 'app-etab-detail',
  templateUrl: '../../../../../base/app/etab/etab/etab-detail/etab-detail.component.html',
  styleUrls: ['./etab-detail.scss']
})
export class EtabDetailComponent extends EtabDetailBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}