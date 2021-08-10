import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { NovapaginaPageRoutingModule } from './novapagina-routing.module';

import { NovapaginaPage } from './novapagina.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    NovapaginaPageRoutingModule
  ],
  declarations: [NovapaginaPage]
})
export class NovapaginaPageModule {}
