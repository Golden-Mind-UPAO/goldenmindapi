import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PsicologosCreateComponent } from './psicologos-create/psicologos-create.component';
import { PsicologosListComponent } from './psicologos-list/psicologos-list.component';
import { PsicologosDetailsComponent } from './psicologos-details/psicologos-details.component';
import { PsicologosEditComponent } from './psicologos-edit/psicologos-edit.component';
import { PsicologosRoutingModule } from './psicologos-routing.module';



@NgModule({
  declarations: [
    PsicologosCreateComponent,
    PsicologosListComponent,
    PsicologosDetailsComponent,
    PsicologosEditComponent
  ],
  imports: [
    CommonModule,
    PsicologosRoutingModule
  ]
})
export class PsicologosModule { }
