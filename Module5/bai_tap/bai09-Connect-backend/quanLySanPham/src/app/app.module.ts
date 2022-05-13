import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductCreateComponent } from './product/product-create/product-create.component';
import { ProductDeleteComponent } from './product/product-delete/product-delete.component';
import { ProductEditComponent } from './product/product-edit/product-edit.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import {ReactiveFormsModule} from '@angular/forms';
import { ListComponent } from './category/list/list.component';
import { DeleteComponent } from './category/delete/delete.component';
import { EditComponent } from './category/edit/edit.component';
import { CreateComponent } from './category/create/create.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductCreateComponent,
    ProductDeleteComponent,
    ProductEditComponent,
    ProductListComponent,
    ListComponent,
    DeleteComponent,
    EditComponent,
    CreateComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
