class CreateMatches < ActiveRecord::Migration
  def change
    create_table :matches do |t|
      t.date :game_date
      t.integer :stage
      t.integer :status
      t.references :local_team_id, index: true
      t.references :visitor_team_id, index: true
      t.integer :score
      t.references :winer_id, index: true
      t.references :loser_id, index: true
      t.boolean :tie
      t.references :group_id, index: true
      t.references :stadium_id, index: true

      t.timestamps
    end
  end
end
