// src/app/app-routing.module.ts
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyComponentComponent } from './my-component/my-component.component';
import { DiscountComponent } from './discount/discount.component';

const routes: Routes = [
  { path: 'my-component', component: MyComponentComponent },
  { path: 'discount', component: DiscountComponent },
  { path: '', redirectTo: '/my-component', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
