import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminAddAddonsComponent } from './admin-addons/admin-add-addons/admin-add-addons.component';
import { AdminAddonsComponent } from './admin-addons/admin-addons.component';
import { AdminComponent } from './dashboard/admin/admin.component';
import { UserComponent } from './dashboard/user/user.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
    pathMatch: 'full'
  },
  {
    path: 'signup',
    component: SignupComponent,
    pathMatch: 'full'
  },
  {
    path: 'admin-dashboard',
    component: AdminComponent,
    pathMatch: 'full'
  },
  {
    path: 'user-dashboard',
    component: UserComponent,
    pathMatch: 'full'
  },
  {
    path: 'admin',
    children: [
      {
        path: 'addons',
        component: AdminAddonsComponent
      },

      {
        path: 'addAdd-ons',
        component: AdminAddAddonsComponent
      },
      {
        path: 'saveAddons',
        component: AdminAddonsComponent
      }

    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
