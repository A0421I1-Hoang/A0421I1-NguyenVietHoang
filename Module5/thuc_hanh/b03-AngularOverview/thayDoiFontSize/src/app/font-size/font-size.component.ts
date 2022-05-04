import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-font-size',
  templateUrl: './font-size.component.html',
})
export class FontSizeComponent implements OnInit {
  fontSize = 14;
  constructor() { }

  ngOnInit(): void {
  }

  changeFontSizeValue(fontSize) {
    this.fontSize = fontSize;
  }

}
