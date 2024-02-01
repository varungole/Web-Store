import './App.css';
import Categories from './components/Categories';
import Footer from './components/Footer';
import Navbar from './components/Navbar';

function App() {
  return (
    <div className="App">
    <Navbar />
    <Categories /> 
    <Footer />
    </div>
  );
}

export default App;
