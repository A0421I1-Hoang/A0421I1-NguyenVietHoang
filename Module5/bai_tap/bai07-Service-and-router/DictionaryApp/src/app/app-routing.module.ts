import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionaryDetailComponent} from './dictionary-detail/dictionary-detail.component';
import {DictionaryPageComponentComponent} from './dictionary-page-component/dictionary-page-component.component';


const routes: Routes = [
  {
    path: 'translate/:wordEnglish',
    component: DictionaryDetailComponent
  },
  {
    path: '',
    component: DictionaryPageComponentComponent
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
