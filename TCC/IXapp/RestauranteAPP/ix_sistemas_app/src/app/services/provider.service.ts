import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { ProdutoDTO } from '../models/produto.dto';
import { BehaviorSubject } from 'rxjs';
 @Injectable({
  providedIn: 'root'
})
export class ProviderService {

  url: string = "http://ix-sistemas.000webhostapp.com/src/controll/routes";

  constructor(public http: HttpClient) {
   
   }
   getPegar(){
     return this.http.get<ProdutoDTO[]>(this.url+'/route.produto.php?id_produto=0');
   }


   private cart = [];
   private cartItemCount = new BehaviorSubject(0);
  
     
  
   getCart() {
     return this.cart;
   }
  
   getCartItemCount() {
     return this.cartItemCount;
   }
  
   addProduct(product) {
     let added = false;
     for (let p of this.cart) {
       if (p.id_produto === product.id_produto) {
         p.amount += 1;
         added = true;
         break;
       }
     }
     if (!added) {
       product.amount = 1;
       this.cart.push(product);
     }
     this.cartItemCount.next(this.cartItemCount.value + 1);
   }
  
   decreaseProduct(product) {
     for (let [index, p] of this.cart.entries()) {
       if (p.id_produto === product.id_produto) {
         p.amount -= 1;
         if (p.amount == 0) {
           this.cart.splice(index, 1);
         }
       }
     }
     this.cartItemCount.next(this.cartItemCount.value - 1);
   }
  
   removeProduct(product) {
     for (let [index, p] of this.cart.entries()) {
       if (p.id_produto === product.id_produto) {
         this.cartItemCount.next(this.cartItemCount.value - p.amount);
         this.cart.splice(index, 1);
       }
     }
   }

  

  removeAll(){
    this.cartItemCount.next(this.cartItemCount.value * 0);
    this.cart.splice(0,this.cart.length)
  }


  }