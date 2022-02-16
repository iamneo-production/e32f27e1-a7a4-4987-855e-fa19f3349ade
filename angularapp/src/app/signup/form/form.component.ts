import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  show:boolean = false
  userRole:string='Select Customer Type'
  constructor() { }

  ngOnInit(): void {
  }
  typeToggler(r: string) {
    this.show = !this.show;
    this.userRole = r;
  }
}
