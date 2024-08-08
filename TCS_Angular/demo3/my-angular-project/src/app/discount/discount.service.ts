// src/app/discount.service.ts
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class DiscountService {
  getDiscountStatus(): boolean {
    return true; // Example static data; replace with real logic or API call
  }
}
