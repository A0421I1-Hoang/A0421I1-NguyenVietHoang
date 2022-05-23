import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {RouterModule} from '@angular/router';
import {BenhAnModule} from './benh-an/benh-an.module';
import {BenhAnRoutingModule} from './benh-an/benhAn-routing.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule,
    BrowserAnimationsModule,
    FormsModule,
    AppRoutingModule,
    BenhAnModule,
    BenhAnRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
