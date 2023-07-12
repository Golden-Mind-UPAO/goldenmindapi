import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PsicologosCreateComponent } from './psicologos-create/psicologos-create.component';
import { PsicologosDetailsComponent } from './psicologos-details/psicologos-details.component';
import { PsicologosEditComponent } from './psicologos-edit/psicologos-edit.component';
import { PsicologosListComponent } from './psicologos-list/psicologos-list.component';

const routes: Routes = [
  { path:'psicologos', component: PsicologosListComponent},
  { path:'psicologosCreate', component: PsicologosCreateComponent},
  { path:'psicologosEdit/:id', component: PsicologosEditComponent},
  { path:'psicologosDetails/id', component: PsicologosDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PsicologosRoutingModule { }