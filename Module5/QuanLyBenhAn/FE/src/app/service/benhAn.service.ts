import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {BenhAn} from '../model/benh-an';

@Injectable({
  providedIn: 'root'
})
export class BenhAnService {

  readonly URL_BENHAN = 'http://localhost:3000/benh_an';

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<BenhAn[]>{
    return this.httpClient.get<BenhAn[]>(this.URL_BENHAN);
  }

  saveBenhAn(benhAn: BenhAn): Observable<BenhAn>{
    return this.httpClient.post<BenhAn>(this.URL_BENHAN, benhAn);
  }

  findById(id: number): Observable<BenhAn> {
    return this.httpClient.get<BenhAn>(this.URL_BENHAN + '/' + id);
  }

  deleteBenhAn(id: string): Observable<BenhAn>{
    return this.httpClient.delete<BenhAn>(this.URL_BENHAN + '/' + id);
  }

  updateBenhAn(benhAn: BenhAn): Observable<BenhAn>{
    return this.httpClient.put<BenhAn>(this.URL_BENHAN + '/' + benhAn.id, benhAn);
  }
}
