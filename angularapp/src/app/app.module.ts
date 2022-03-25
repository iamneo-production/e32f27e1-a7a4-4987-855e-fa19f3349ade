import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookingComponent } from './booking/booking.component';
import { BookEventNavBarComponent } from './booking/book-event-nav-bar/book-event-nav-bar.component';
import { BookEventContentComponent } from './booking/book-event-content/book-event-content.component';
import { BookEventFooterComponent } from './booking/book-event-footer/book-event-footer.component';

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    BookEventNavBarComponent,
    BookEventContentComponent,
    BookEventFooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
