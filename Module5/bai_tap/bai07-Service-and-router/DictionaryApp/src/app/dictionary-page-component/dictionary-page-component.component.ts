import { Component, OnInit } from '@angular/core';
import {IWord} from '../iword';
import {DictionaryService} from '../service/dictionary.service';
import {Routes} from '@angular/router';

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary-page-component.component.html',
  styleUrls: ['./dictionary-page-component.component.css']
})
export class DictionaryPageComponentComponent implements OnInit {

  list: IWord[] = [];

  constructor(private dictionary: DictionaryService) { }

  ngOnInit(): void {
    this.getAllWord();
  }

  private getAllWord() {
    this.list = this.dictionary.getAll();
  }


}
