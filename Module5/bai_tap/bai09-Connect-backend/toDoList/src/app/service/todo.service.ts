import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Todo} from '../todo';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  URL_API = 'http://localhost:3000/todos';

  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(this.URL_API);
  }
  createTodo(todo: Todo): Observable<any> {
    return this.httpClient.post(this.URL_API, todo);
  }
  deleteTodo(id: number): Observable<Todo> {
    return this.httpClient.delete(this.URL_API + '/' + id);
  }
  findTodoById(id: number): Observable<Todo> {
    return this.httpClient.get(this.URL_API + '/' + id);
  }
  editTodo(id: number, todo: Todo): Observable<Todo> {
    return this.httpClient.put(this.URL_API + '/' + id, todo);
  }
}
