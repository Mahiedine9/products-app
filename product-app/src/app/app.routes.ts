import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductFormComponent } from './product-form/product-form.component';

export const routes: Routes = [
  { path: 'products', component: ProductListComponent },
  { path: 'products/add-product', component: ProductFormComponent },
  { path: '', redirectTo: '/products', pathMatch: 'full' }
];


export class AppRoutingModule { }
