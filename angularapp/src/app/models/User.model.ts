export class UserModel {
  constructor(private userRole: string,
    private email: string,
    private password: string,
    private username: string,
    private mobileNumber: string){}
    public getEmail(){
      return this.email
    }
    public getUsername(){
      return this.username
    }
}