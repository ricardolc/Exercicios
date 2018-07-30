import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { adminLteConf } from './admin-lte.conf';

import { AppRoutingModule } from './app-routing.module';
import { CoreModule } from './core/core.module';

import { LayoutModule } from 'angular-admin-lte';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { LoadingPageModule, MaterialBarModule } from 'angular-loading-page';
import { RouterModule } from '@angular/router';
//import { PeopleComponent } from './people/people.component';



@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    CoreModule,
    LayoutModule.forRoot(adminLteConf),
    LoadingPageModule, MaterialBarModule
    //,
    //RouterModule.forRoot([
    //  { path: "", component: HomeComponent}
    //])
  ],
  declarations: [
    AppComponent,
    HomeComponent
  //  PeopleComponent
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
