import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { ProviderService } from 'src/app/services/provider.service';
import { ModalController, AlertController } from '@ionic/angular';
import { ProdutoDTO } from 'src/app/models/produto.dto';
 
@Component({
  selector: 'app-cart-modal',
  templateUrl: './cart-modal.page.html',
  styleUrls: ['./cart-modal.page.scss'],
})
export class CartModalPage {
 
  cart: ProdutoDTO[] = [];
  @ViewChild('cart', {static: false, read: ElementRef})fab: ElementRef;
 
  constructor(private servidor: ProviderService, private modalCtrl: ModalController, private alertCtrl: AlertController) { }

  ngOnInit() {
    this.cart = this.servidor.getCart();
  }
 
  decreaseCartItem(product) {
    this.servidor.decreaseProduct(product);
  }
 
  increaseCartItem(product) {
    this.servidor.addProduct(product);
  }
 
  removeCartItem(product) {
    this.servidor.removeProduct(product);
  }
 
  getTotal() {
    
    return this.cart.reduce((i, j) => i + j.valor * j.amount, 0);
  }
 
  close() {
    this.modalCtrl.dismiss();
  }
 
  async checkout() {

    if(this.getTotal() != 0){ // Carrinho com algum produto
      this.servidor.removeAll();
 
      let alert = await this.alertCtrl.create({
        header: 'Obrigado por pedir!',
        message: 'Sua refeição será entregue o mais rápido possível.',
        buttons: ['OK']
      });
      alert.present().then(() => {
        this.modalCtrl.dismiss();
      });

    }else{// Carrinho sem produto

      let alert = await this.alertCtrl.create({
        header: 'Não irá pedir nada? :(',
        message: 'Escolha um produto para completar o pedido.',
        buttons: ['OK']
      });
      alert.present().then(() => {
        this.modalCtrl.dismiss();
      });

    }
   
  }
  
}