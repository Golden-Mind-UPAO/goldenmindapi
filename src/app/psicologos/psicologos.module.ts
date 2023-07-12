import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PsicologosCreateComponent } from './psicologos-create/psicologos-create.component';
import { PsicologosListComponent } from './psicologos-list/psicologos-list.component';
import { PsicologosDetailsComponent } from './psicologos-details/psicologos-details.component';
import { PsicologosEditComponent } from './psicologos-edit/psicologos-edit.component';
import { PsicologosRoutingModule } from './psicologos-routing.module';
import {MatInputModule} from '@angular/material/input' ;
import {MatGridListModule} from '@angular/material/grid-list';
import {MatRadioModule} from '@angular/material/radio';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatButtonModule} from '@angular/material/button' ;



@NgModule({
  declarations: [
    PsicologosCreateComponent,
    PsicologosListComponent,
    PsicologosDetailsComponent,
    PsicologosEditComponent
  ],
  imports: [
    CommonModule,
    PsicologosRoutingModule,
    MatInputModule,
    MatGridListModule,
    MatRadioModule,
    MatDatepickerModule,
    MatButtonModule  
  ]
})
export class PsicologosModule { }