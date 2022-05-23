import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from './benh-an/list/list.component';
import {EditComponent} from './benh-an/edit/edit.component';
import {DeleteComponent} from './benh-an/delete/delete.component';

const routes: Routes = [
  {
    path: '', children: [
      {path: 'list', component: ListComponent},
      {path: 'edit/:id', component: EditComponent},
      {path: 'delete/:id', component: DeleteComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
