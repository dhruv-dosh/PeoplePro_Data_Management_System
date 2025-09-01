# Use an official Node.js image as the base
FROM node:20-alpine

# Set working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json first (for caching npm install)
COPY package*.json ./

# Install project dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Expose the port your app runs on (default for React dev server is 3000)
EXPOSE 3000

# Start the application
CMD ["npm", "start"]
