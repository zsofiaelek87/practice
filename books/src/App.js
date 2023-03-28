import logo from './logo.svg';
import './App.css';
import { Component } from "react";
import axios from 'axios';


let initialBook = {
  bookId: null,
  bookName: null,
  bookAuthor: null
}

class App extends Component {



  constructor(props) {
    super(props);
    this.state = {
      book: { ...initialBook },
      books: []
    };

    this.handleButtonPushEvent = this.handleButtonPushEvent.bind(this);
    this.handleBookIdChangeEvent = this.handleBookIdChangeEvent.bind(this);
    this.handleBookNameChangeEvent = this.handleBookNameChangeEvent.bind(this);
    this.handleBookAuthorChangeEvent = this.handleBookAuthorChangeEvent.bind(this);
    this.handleGetAllButtonPushEvent = this.handleGetAllButtonPushEvent.bind(this);
    this.handleNewButtonPushEvent = this.handleNewButtonPushEvent.bind(this);
    this.handleUpdateButtonPushEvent = this.handleUpdateButtonPushEvent.bind(this);
    this.handleSearchButtonPushEvent = this.handleSearchButtonPushEvent.bind(this);
    this.handleDeleteButtonPushEvent = this.handleDeleteButtonPushEvent.bind(this);

  }




  render() {
    return (
      <div className="App">
        <header className="App-header">

        <div>---Welcome to the Library---
        
        </div>
          <form >

            <div className="form-group">
              <label htmlFor="bookId">Book ID:</label>
              <input type="text" className="form-control" id="bookId" placeholder="BookId" onChange={this.handleBookIdChangeEvent} value={this.state.book.bookId} />
            </div>

            <div className="form-group">
              <label htmlFor="bookName">Book Name:</label>
              <input type="text" className="form-control" id="bookName" placeholder="BookName" onChange={this.handleBookNameChangeEvent} value={this.state.book.bookName} />
            </div>

            <div className="form-group">
              <label htmlFor="bookAuthor">Book Author:</label>
              <input type="text" className="form-control" id="bookAuthor" placeholder="BookAuthor" onChange={this.handleBookAuthorChangeEvent} value={this.state.book.bookAuthor} />
            </div>

            <button className="btn btn-success" onClick={this.handleNewButtonPushEvent}>Submit new Book</button>
          
            <button className="btn btn-primary" onClick={this.handleUpdateButtonPushEvent}>Update Book</button>

            <button className="btn btn-warning" onClick={this.handleSearchButtonPushEvent}>Search Book</button>

            <button className="btn btn-danger" onClick={this.handleDeleteButtonPushEvent}>Delete Book</button>


          </form>


          <div>---Get all books---</div>
          <form onSubmit={this.handleGetAllButtonPushEvent}>

            <button className="btn btn-default">Get ALL books</button>

          </form>

        </header>

        <div className="book-list">
          <table>
            <thead>
              <tr>
                <th>Book ID</th>
                <th>Book Author</th>
                <th>Book Name</th>
              </tr>
            </thead>
            <tbody>
              {this.state.books.map((value, index) => (
                <tr key={index}>
                  <td>{value.book.bookId}</td>
                  <td>{value.book.bookAuthor}</td>
                  <td>{value.book.bookName}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

      </div>
    );
  }

  handleButtonPushEvent(event) {
    event.preventDefault();

    axios.post('http://localhost:8080/books', { book: this.state.book }, { headers: { "Content-Type": "application/json" } })
      .then(response => {
        this.setState({ book: { ...initialBook } });


      })
      .catch(error => {
        console.log(error)
      });


    axios.get('http://localhost:8080/books')
      .then(response => {
        let books = response.data;
        console.log(books);
        this.setState({ books: [...books] });
      });

  }

  handleNewButtonPushEvent(event) {
    event.preventDefault();

    axios.post('http://localhost:8080/books', { book: this.state.book }, { headers: { "Content-Type": "application/json" } })
      .then(response => {
        this.setState({ book: { ...initialBook } });
      })
      .catch(error => {
        console.log(error)
      });

  }



  handleUpdateButtonPushEvent(event) {
    event.preventDefault();

    axios.patch('http://localhost:8080/books', { book: this.state.book }, { headers: { "Content-Type": "application/json" } })
      .then(response => {
        this.setState({ book: { ...initialBook } });
      })
      .catch(error => {
        console.log(error)
      });

  }

  handleSearchButtonPushEvent(event) {
    event.preventDefault();

    axios.get(`http://localhost:8080/books/${this.state.book.bookId}`)
      .then(response => {
        let book = response.data;
        console.log(book);
        this.setState({ books: [book] });
      });

  }

  
  handleDeleteButtonPushEvent(event) {
    event.preventDefault();

    axios.delete(`http://localhost:8080/books/${this.state.book.bookId}`)
      .then(response => {
        this.setState({ book: { ...initialBook } });
      })
      .catch(error => {
        console.log(error)
      });

  }


  handleGetAllButtonPushEvent(event) {
    event.preventDefault();

    axios.get('http://localhost:8080/books')
      .then(response => {
        let books = response.data;
        console.log(books);
        this.setState({ books: [...books] });
      });

  }


  handleBookIdChangeEvent(event) {
    let book = { ...this.state.book };
    book.bookId = event.target.value;
    this.setState({ book });

  }

  handleBookAuthorChangeEvent(event) {
    let book = { ...this.state.book };
    book.bookAuthor = event.target.value;
    this.setState({ book });
  }

  handleBookNameChangeEvent(event) {
    let book = { ...this.state.book };
    book.bookName = event.target.value;
    this.setState({ book });
  }
};



export default App;
