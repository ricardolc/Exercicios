import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeComponent } from './home.component';

import { BoxModule } from 'angular-admin-lte';
//> npm remove -g @angular/cli
//> npm install -g @angular/cli@1.4.10
//> ng --version
//  @angular/cli: 1.4.10
//> ng new myangular4 --ng4






describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [BoxModule],
      declarations: [HomeComponent]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
