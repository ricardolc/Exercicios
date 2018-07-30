import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule }   from '@angular/forms';

import { PeopleRoutingModule } from './people-routing.module';
import { PeopleComponent } from './people.component';

@NgModule({
  imports: [
    CommonModule,
    PeopleRoutingModule,
    FormsModule
  ],
  declarations: [PeopleComponent]
})
export class PeopleModule { }