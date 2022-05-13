import { Component, OnInit } from '@angular/core';
import {Todo} from '../../todo';
import {FormControl} from '@angular/forms';
import {TodoService} from '../../service/todo.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  todos: Todo[] = [];
  content = new FormControl();
  constructor(private todoService: TodoService) { }

  ngOnInit(): void {
    this.todoService.getAll().subscribe(
      (data) => {
        this.todos = data;
      }
    );
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
    this.todos[i].complete = true;
  }
  change() {
    const value = this.content.value;
    console.log(value);
    if (value) {
      const todo: Todo = {
        // id: _id++,
        content: value,
        complete: false
      };
      // this.todos.push(todo);
      this.todoService.createTodo(todo).subscribe(
        () => {
          this.content.reset();
        },
        () => {},
        () => {
          this.ngOnInit();
        }
      );
    }
  }

  deleteTodo(id: number) {
    this.todoService.deleteTodo(id).subscribe(
      () => {},
      () => {},
      () => {
        this.ngOnInit();
      }
    );
  }

  editTodo(id: number) {
    // this.todoService.editTodo(id, this.todos).subscribe();
  }

}

