import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {BenhAnService} from '../../service/benhAn.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {


  constructor(private activatedRoute: ActivatedRoute, private service: BenhAnService,
              private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      console.log(id);
      this.service.deleteBenhAn(id).subscribe(next => this.router.navigateByUrl('list'));
    });
  }
}
