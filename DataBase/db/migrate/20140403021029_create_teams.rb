class CreateTeams < ActiveRecord::Migration
  def change
    create_table :teams do |t|
      t.string :name
      t.string :coach
      t.string :flag
      t.string :uniform
      t.text :history

      t.timestamps
    end
  end
end
