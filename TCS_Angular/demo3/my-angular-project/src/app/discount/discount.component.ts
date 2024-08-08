import { Component, OnInit, OnDestroy  } from '@angular/core';
import { DiscountService } from './discount.service';
@Component({
  selector: 'app-discount',
  templateUrl: './discount.component.html',
  styleUrls: ['./discount.component.css']
})
export class DiscountComponent implements OnInit, OnDestroy  {

  isDiscountAvailable: boolean = true;

  constructor(private discountService: DiscountService) { 

  }

  ngOnInit(): void {
    console.log('DiscountComponent initialized');
  }

  ngOnDestroy(): void {
    console.log('DiscountComponent destroyed');
  }


  claimDiscount(): void {
    console.log('Discount claimed in DiscountComponent!');
    this.isDiscountAvailable = false;
  }
}


