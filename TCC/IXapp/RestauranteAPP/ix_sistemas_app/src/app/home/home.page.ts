import { Component /*ViewChild, ElementRef*/ } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { BehaviorSubject } from 'rxjs';
import { ProdutoDTO } from '../../app/models/produto.dto';
import { CartModalPage } from '../pages/cart-modal/cart-modal.page';
import { ProviderService } from '../services/provider.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss']
})
export class HomePage {
  products: ProdutoDTO[];
  cart = [];
  cartItemCount: BehaviorSubject<number>;
 
  constructor(public servidor: ProviderService, private modalCtrl: ModalController) {}
  ngOnInit(): void {
    this.getRetornar();
    this.cart = this.servidor.getCart();
    this.cartItemCount = this.servidor.getCartItemCount();
  }
  
  addToCart(product) {
    this.servidor.addProduct(product);
    
  }
  async openCart() {
 
    let modal = await this.modalCtrl.create({
      component: CartModalPage,
      cssClass: 'cart-modal'
    });
    modal.present();
  }
  
  removeAll(){
    this.cartItemCount.next(this.cartItemCount.value * 0);
    this.cart.splice(0,this.cart.length)
  }

  getRetornar(){
    this.servidor.getPegar()
  .subscribe(response => {
    this.products = response;

    this.products.forEach(element => {
      element.amount = 0;
      element.valor = Number.parseFloat(element.valor.toString().substring(3));
    });
  },
    error => {}
  );
}

 
}