import { Component, OnInit } from '@angular/core';
import {BenhAn} from '../../model/benh-an';
import {BenhAnService} from '../../service/benhAn.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  benhAnList: BenhAn[] ;

  constructor(private benhAnService: BenhAnService) {}

  deleteRowData(benhAn) {
    this.benhAnService.deleteBenhAn(benhAn.id).subscribe(() => {
        this.getAll();
      }
    );
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.benhAnService.getAll().subscribe(
      next => {
        this.benhAnList = next;
      });
  }

}
