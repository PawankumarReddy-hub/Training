import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'; // Optional if using HTTP Client
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { DiscountComponent } from './discount/discount.component';
import { ReversePipe } from './reverse.pipe'; // Optional

@NgModule({
  declarations: [
    AppComponent,
    MyComponentComponent,
    DiscountComponent,
    ReversePipe // Optional
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule, // Optional
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
