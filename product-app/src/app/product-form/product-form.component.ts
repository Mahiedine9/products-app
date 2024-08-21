import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-product-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.scss']
})
export class ProductFormComponent {

  product: Product = {
    id: 0,
    name: '',
    price: 0
  };

  constructor(private productService: ProductService, private router : Router) { }

  onSubmit(): void {
    this.productService.addProduct(this.product).subscribe({
      next: (response) => {
        console.log('Product added successfully', response);
        this.router.navigate(['/products']);
        this.resetForm();
      },
      error: (err) => {
        console.error('Error adding product', err);
      }
    });
  }

  onCancel(): void {
    this.router.navigate(['/products']); 
  }

  resetForm(): void {
    this.product = {
      id: 0,
      name: '',
      price: 0
    };
  }
}
