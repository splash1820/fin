// Get the necessary elements
const businessesLink = document.getElementById('businesses-link');
const businessesSection = document.getElementById('businesses-section');
const businessDetailSection = document.getElementById('business-details');
const businessList = document.querySelector('.business-list');
const expensesLink = document.getElementById('expenses-link');
const revenueLink = document.getElementById('revenue-link');
const profitLink = document.getElementById('profit-link');
const expensesSection = document.getElementById('expenses-section');
const revenueSection = document.getElementById('revenue-section');
const profitSection = document.getElementById('profit-section');

// Fetch and display the list of businesses
function fetchAndDisplayBusinesses() {
  // Fetch the list of businesses from the backend
  const businesses = [
    { id: 1, name: 'Business 1' },
    { id: 2, name: 'Business 2' },
    { id: 3, name: 'Business 3' },
  ];

  // Display the list of businesses
  businesses.forEach((business) => {
    const businessItem = document.createElement('li');
    businessItem.textContent = business.name;
    businessItem.addEventListener('click', () => showBusinessDetails(business));
    businessList.appendChild(businessItem);
  });

  businessesSection.classList.remove('hidden');
}

// Show the details of the selected business
function showBusinessDetails(business) {
  // Update the business name in the business details section
  const businessNameElement = document.querySelector('#business-details h2');
  businessNameElement.textContent = business.name;

  // Show the business details section and hide the businesses section
  businessesSection.classList.add('hidden');
  businessDetailSection.classList.remove('hidden');
}

// Handle the clicks on the business options
expensesLink.addEventListener('click', () => {
  expensesSection.classList.remove('hidden');
  revenueSection.classList.add('hidden');
  profitSection.classList.add('hidden');
});

revenueLink.addEventListener('click', () => {
  expensesSection.classList.add('hidden');
  revenueSection.classList.remove('hidden');
  profitSection.classList.add('hidden');
});

profitLink.addEventListener('click', () => {
  expensesSection.classList.add('hidden');
  revenueSection.classList.add('hidden');
  profitSection.classList.remove('hidden');
});

// Load the businesses when the page is loaded
window.addEventListener('DOMContentLoaded', fetchAndDisplayBusinesses);