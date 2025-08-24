import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({ providedIn: 'root' })
export class WelcomeService {
  constructor(private http: HttpClient) {}

  getWelcomeMessages() {
    return this.http.get<{ en: string; fr: string }>('http://localhost:8080/api/welcome');
  }
}
