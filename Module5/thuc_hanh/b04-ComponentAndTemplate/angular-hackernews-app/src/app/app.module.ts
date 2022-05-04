import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HackerNewComponent } from './hacker-new/hacker-new.component';
import {FormsModule} from '@angular/forms';
import { HackernewComponent } from './hackernew/hackernew.component';

@NgModule({
  declarations: [
    AppComponent,
    HackerNewComponent,
    HackernewComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
