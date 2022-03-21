import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { AddonModel } from 'src/app/models/AddOn.model';
import { AddonService } from 'src/app/services/addon.service';

@Component({
  selector: 'app-admin-add-addons',
  templateUrl: './admin-add-addons.component.html',
  styleUrls: ['./admin-add-addons.component.css']
})
export class AdminAddAddonsComponent implements OnInit {

  addOn : AddonModel = new AddonModel();

  addOnForm : FormGroup;

  constructor(private addOnService: AddonService) { }

  ngOnInit(): void {
    this.initializeValues()
  }

  initializeValues(){
    //TODO initialize addOn in case of update

    
    this.addOnForm = new FormGroup({
      name: new FormControl(''),
      description: new FormControl(''),
      addOnPrice: new FormControl(''),
      imageUrl: new FormControl(''),
    });
  }

  submit(){    
    this.addOnService.saveAddOn(this.addOn).subscribe((response: any) => {
      console.log('Saved successfully', response)
      this.addOnForm.reset()
      //TODO display snack bar for saved message and remove alert
      alert('Saved successfully')
    },
    (error) => {
      //TODO display snack bar for error saving details
    })
  }

}
