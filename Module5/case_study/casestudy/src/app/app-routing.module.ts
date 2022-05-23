import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from './customer/list/list.component';
import {EditComponent} from './customer/edit/edit.component';
import {DeleteComponent} from './customer/delete/delete.component';
import {CreateComponent} from './customer/create/create.component';

const routes: Routes = [
  {
    path: '', children: [
      {path: 'list', component: ListComponent},
      {path: 'edit/:id', component: EditComponent},
      {path: 'delete/:id', component: DeleteComponent},
      {path: 'create', component: CreateComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
